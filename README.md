# Stripe Integration Service

[![Build Status](https://semaphoreci.com/api/v1/weareswat/stripe-integration/branches/boot/badge.svg)](https://semaphoreci.com/weareswat/stripe-integration)

### Running

You need to install [lein](http://leiningen.org/)

* `lein server` - starts the HTTP server

#### Tests

* `lein test` - runs the test suite
* `script/autotest` or `lein autotest` -listen for file changes and is always running tests
* To Run the integration test you should provide a valid Stripe API KEY with access to mb references api.
  `STRIPE_API_KEY=<YOUR_STRIPE_API_KEY> lein test`


## Environments

### Staging

The staging environment is located [here](http://stripe-integration-staging.herokuapp.com/) and you can read and try the api documentation [here](http://stripe-integration-staging.herokuapp.com/api-docs/).
