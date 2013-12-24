;;; Copyright (c) 2013 David Goldfarb. All rights reserved.
;;; Contact info: deg@degel.com
;;;
;;; The use and distribution terms for this software are covered by the Eclipse
;;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) which can
;;; be found in the file epl-v10.html at the root of this distribution.
;;; By using this software in any fashion, you are agreeing to be bound by the
;;; terms of this license.
;;;
;;; You must not remove this notice, or any other, from this software.


(defproject degel/my-muxx-sites "0.1.4"
  :description "Deployment project to wrap my web apps into a single site."
  :url "https://github.com/deg/my-muxx-sites"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]

                 ;; Degel Clojure utility library
                 [degel/degel-clojure-utils "0.1.20"]

                 ;; Degel website multiplexer
                 [degel/muxx "0.1.5"]

                 ;; Our apps
                 [degel/mummy "0.1.1"]
                 [deg-scraps "0.1.3"]
                 [degel/webol "0.1.8"]]

  :profiles {:dev
             { :plugins [[lein-marginalia "0.7.1"]]}}

  :min-lein-version "2.0.0"
  ;:pedantic? :abort

  :main degel.deploy.deployment)
