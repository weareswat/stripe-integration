(ns weareswat.stripe-integration.routes
  "Specifices the routes"
  (:require [compojure.core :as compojure :refer [GET]]
            [compojure.route :as route]
            [result.core :as result]
            [weareswat.stripe-integration.handlers.index :as index]))

(compojure/defroutes public-routes
  "The routes available to be served, that don't need auth"
  (GET "/" request (index/handle request))
  (route/not-found (result/failure {:error "not-found"})))
