(ns weareswat.stripe-integration.system
  "The system that has all the server's components"
  (:require [com.stuartsierra.component :as component]
            [com.walmartlabs.system-viz :as system-viz]
            [weareswat.stripe-integration.http-component :as http-component]
            [weareswat.stripe-integration.web-app-component :as web-app-component]))

(defn create
  "Creates a new system to execute the app"
  []
  (component/system-map
   :http-server (http-component/create)
   :web-app (web-app-component/create)))

(defn -main
  "Runs a viz of the system"
  [& args]
  (system-viz/visualize-system (create)))
