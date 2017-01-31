(ns weareswat.stripe-integration.handlers.index-test
  (:use clojure.test)
  (:require [weareswat.stripe-integration.handlers.test-request :as test-request]
            [result.core :as result]))

(deftest basic-test
  (testing "Index returns OK"
    (let [response (test-request/parsed-response :get "/")
          body (:body response)]
      (is (= 200 (:status response))))))
