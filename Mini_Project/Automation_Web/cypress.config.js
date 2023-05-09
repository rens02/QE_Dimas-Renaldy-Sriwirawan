const cucumber = require('cypress-cucumber-preprocessor').default
const { defineConfig } = require("cypress");

module.exports = defineConfig({
  env:{
    fname:"Diandre Januardi",
    regEmail:"TESTINGAUTO123@outlook.com",
    pass: "andreas123",
  },
  projectId: 'gnymed',
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
      on('file:preprocessor', cucumber())
    },
    specPattern: "cypress/e2e/*.feature"
  },
});
