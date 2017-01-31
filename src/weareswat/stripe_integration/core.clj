(ns weareswat.stripe-integration.core
  "This namespace has the main fn that starts the server."
  (:gen-class)
  (:require [com.stuartsierra.component :as component]
            [clojure.core.async :as async]
            [taoensso.timbre :as logger]
            [weareswat.stripe-integration.system :as system]))

(defn- on-shutdown
  "Runs shutdown hooks"
  [system]
  (logger/info "Shutdown system...")
  (component/stop system))

(defn -main
  "Starts the service server"
  [& args]
  (let [system (component/start (system/create))]
    (.addShutdownHook (Runtime/getRuntime) (Thread. (partial on-shutdown system)))
    (async/<!! (-> system :http-server :closed-ch))))
