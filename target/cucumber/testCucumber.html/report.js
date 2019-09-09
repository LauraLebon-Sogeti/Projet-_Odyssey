$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testCucumber.feature");
formatter.feature({
  "line": 1,
  "name": "exempleCucumber",
  "description": "",
  "id": "exemplecucumber",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "tests connexion Odyssey",
  "description": "",
  "id": "exemplecucumber;tests-connexion-odyssey",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "j\u0027ai url du site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "le navigateur est ouvert",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "je tape URL du site",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "la page accueil de Odyssey est affichee",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "exemplecucumber;tests-connexion-odyssey;",
  "rows": [
    {
      "cells": [
        "navigateur"
      ],
      "line": 10,
      "id": "exemplecucumber;tests-connexion-odyssey;;1"
    },
    {
      "cells": [
        "firefox"
      ],
      "line": 11,
      "id": "exemplecucumber;tests-connexion-odyssey;;2"
    },
    {
      "cells": [
        "chrome"
      ],
      "line": 12,
      "id": "exemplecucumber;tests-connexion-odyssey;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4859121000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "tests connexion Odyssey",
  "description": "",
  "id": "exemplecucumber;tests-connexion-odyssey;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "j\u0027ai url du site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "le navigateur est ouvert",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "je tape URL du site",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "la page accueil de Odyssey est affichee",
  "keyword": "Then "
});
formatter.match({
  "location": "fonctionsCucumber.recupererUrl()"
});
formatter.result({
  "duration": 182767100,
  "status": "passed"
});
formatter.match({
  "location": "fonctionsCucumber.verifierNavigateur()"
});
formatter.result({
  "duration": 50400,
  "status": "passed"
});
formatter.match({
  "location": "fonctionsCucumber.lancerSite()"
});
formatter.result({
  "duration": 3996117800,
  "status": "passed"
});
formatter.match({
  "location": "fonctionsCucumber.verifierAffichagePage()"
});
formatter.result({
  "duration": 13157700,
  "status": "passed"
});
formatter.after({
  "duration": 1375631300,
  "status": "passed"
});
formatter.before({
  "duration": 3364440800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "tests connexion Odyssey",
  "description": "",
  "id": "exemplecucumber;tests-connexion-odyssey;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "j\u0027ai url du site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "le navigateur est ouvert",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "je tape URL du site",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "la page accueil de Odyssey est affichee",
  "keyword": "Then "
});
formatter.match({
  "location": "fonctionsCucumber.recupererUrl()"
});
formatter.result({
  "duration": 29600,
  "status": "passed"
});
formatter.match({
  "location": "fonctionsCucumber.verifierNavigateur()"
});
formatter.result({
  "duration": 33100,
  "status": "passed"
});
formatter.match({
  "location": "fonctionsCucumber.lancerSite()"
});
formatter.result({
  "duration": 3354135900,
  "status": "passed"
});
formatter.match({
  "location": "fonctionsCucumber.verifierAffichagePage()"
});
formatter.result({
  "duration": 8933900,
  "status": "passed"
});
formatter.after({
  "duration": 1188712500,
  "status": "passed"
});
});