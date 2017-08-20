package ru.tmin10.EveSecurityService.Utils;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class DB
{
    private Connection dbConnection;

    public DB(@Nonnull String dbConnectionString) throws SQLException
    {
        this.dbConnection = DriverManager.getConnection(dbConnectionString);
    }

    @Nullable
    public String getClientToken(@Nonnull String refreshToken) throws Exception
    {
        String clientToken = null;
        clientToken = generateToken();
        String sql = "INSERT INTO \"auth_tokens_tbl\" " +
                "(\"client_token\", \"sso_refresh_token\") " +
                "VALUES (?, ?)";
        PreparedStatement preparedStatement = this.dbConnection.prepareStatement(sql);
        preparedStatement.setString(1, clientToken);
        preparedStatement.setString(2, refreshToken);
        preparedStatement.execute();
        return clientToken;
    }

    @Nullable
    public String getRefreshToken(@Nonnull String clientToken) throws Exception
    {
        String sql = "SELECT \"sso_refresh_token\" FROM \"auth_tokens_tbl\" " +
                "WHERE client_token=?";
        PreparedStatement preparedStatement = this.dbConnection.prepareStatement(sql);
        preparedStatement.setString(1, clientToken);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getString(1);
    }

    @Nonnull
    public static String generateToken() throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(Double.toString(Math.random()).getBytes("UTF-8"));
        return String.format("%064x", new java.math.BigInteger(1, md.digest()));
    }
}
