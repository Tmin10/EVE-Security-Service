import { Injectable } from '@angular/core';


@Injectable()
export class ConfigService {

    get(name:String): any {
        switch (name) {
            case 'client_id': {
                return '90382b7d0f8b47bf87429dd2ecc3fdf0';
            }
            case 'scope': {
                return 'corporationContactsRead%20publicData%20characterStatsRead%20characterFittingsRead%20characterFittingsWrite%20characterContactsRead%20characterContactsWrite%20characterLocationRead%20characterNavigationWrite%20characterWalletRead%20characterAssetsRead%20characterCalendarRead%20characterFactionalWarfareRead%20characterIndustryJobsRead%20characterKillsRead%20characterMailRead%20characterMarketOrdersRead%20characterMedalsRead%20characterNotificationsRead%20characterResearchRead%20characterSkillsRead%20characterAccountRead%20characterContractsRead';
            }
            case 'loginButtonImageUrl': {
                return 'https://images.contentful.com/idjq7aai9ylm/4PTzeiAshqiM8osU2giO0Y/5cc4cb60bac52422da2e45db87b6819c/EVE_SSO_Login_Buttons_Large_White.png?w=270&h=45';
            }
            case 'redirect_uri': {
                return 'http://localhost:4200/sso';
            }
        }
    }

}