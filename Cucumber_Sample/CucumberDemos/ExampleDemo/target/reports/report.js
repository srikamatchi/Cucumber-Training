$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/resource/java/Ecommerce.feature");
formatter.feature({
  "line": 1,
  "name": "ECommerce Application",
  "description": "",
  "id": "ecommerce-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Add a product to bag",
  "description": "",
  "id": "ecommerce-application;add-a-product-to-bag",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.this_is_a_blank_test()"
});
formatter.result({
  "duration": 226181148,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Successful Login",
  "description": "",
  "id": "ecommerce-application;successful-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@SmokeTest"
    },
    {
      "line": 11,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.this_is_a_blank_test()"
});
formatter.result({
  "duration": 70974,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Buy a product with cash payment",
  "description": "",
  "id": "ecommerce-application;buy-a-product-with-cash-payment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@SmokeTest"
    },
    {
      "line": 15,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.this_is_a_blank_test()"
});
formatter.result({
  "duration": 64410,
  "status": "passed"
});
});