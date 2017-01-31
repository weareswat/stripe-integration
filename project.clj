(defproject weareswat/stripe-integration "0.1.0"
  :description "Stripe integration"
  :url "https://github.com/weareswat/stripe-integration"

  :license {:name         "MIT"
            :distribution :repo}

  :min-lein-version "2.6.0"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.395"]
                 [com.taoensso/timbre "4.8.0"]
                 [prismatic/schema "1.1.3"]
                 [compojure "1.5.2"]
                 [ring-cors "0.1.9"]
                 [ring/ring-json "0.4.0"]
                 [aleph "0.4.1"]
                 [environ "1.1.0"]

                 [com.stuartsierra/component "0.3.2"]
                 [walmartlabs/system-viz "0.1.1"]
                 [clanhr/result "0.16.0"]
                 [clanhr/reply "1.1.0"]]

  :aliases {"server"  ["trampoline" "run" "-m" "weareswat.stripe-integration.core/-main"]
            "system-viz" ["run" "-m" "weareswat.stripe-integration.system/-main"]
            "autotest" ["trampoline" "with-profile" "+test" "test-refresh"]
            "test"  ["trampoline" "test"]}

  :scm {:name "git"
        :url "git@github.com:weareswat/stripe-integration.git"}

  :main weareswat.stripe-integration.core
  :ring {:handler weareswat.stripe-integration.http-component/app}
  :uberjar-name "weareswat.stripe-integration.jar"

  :profiles {:test {:dependencies [[ring/ring-mock "0.3.0"]
                                   [org.clojure/tools.namespace "0.2.11"]]

                    :plugins [[com.jakemccrary/lein-test-refresh "0.18.1"]
                              [lein-cloverage "1.0.9"]]}}

  :test-refresh {:quiet true
                 :changes-only true})
