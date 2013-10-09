;;; Copyright (c) 2013, David Goldfarb. All rights reserved.
;;; Contact info: deg@degel.com
;;;
;;; The use and distribution terms for this software are covered by the Eclipse
;;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) which can
;;; be found in the file epl-v10.html at the root of this distribution.
;;; By using this software in any fashion, you are agreeing to be bound by the
;;; terms of this license.
;;;
;;; You must not remove this notice, or any other, from this software.


(ns degel.deploy.deployment
  (:gen-class)
  (:require [cemerick.austin :as austin]
            [cemerick.austin.repls :as austin-repls]
            [degel.muxx.server :as muxx]
            [degel.receipts.server :as receipts]
            [degel.webol.server :as webol]
            [degel.cljutil.devutils :as dev]))


(defn -main [& [port]]
  (let [port (Integer. (or port (System/getenv "PORT") 3000))]
    (muxx/run-servers :port port
                      :apps [(receipts/app-properties)
                             (webol/app-properties)])))


(def repl-env
  (reset! austin-repls/browser-repl-env (austin/repl-env)))


(defn start-cljs-repl []
  (-main)
  (austin-repls/cljs-repl repl-env))
