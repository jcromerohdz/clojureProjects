(defproject clojureproject1 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.7.1"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler clojureproject1.core/wrapping-handler
         :init clojureproject1.core/on-init
         :port 7777
         :destroy clojureproject1.core/on-destroy})
