(ns clojureproject1.core
  (:require [clojureproject1.handlers :as handlers]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn example-handler [request]
  (println "Imprime algo!!")
  {:body (pr-str request)})

(defn on-init []
  (println "Initialization sample wepapp!"))

(defn on-destroy []
  (println "Destroying sample webapp!"))

(defn test1-handler [request]
  {:body "test1"})

(defn test2-handler [request]
  {:status 301 :headers {"Location" "http://github.com/ring-clojure"}})

(defn route-handler [request]
  (condp = (:uri request)
    "/test1" (test1-handler request)
    "/test2" (test2-handler request)
    "/test3" (handlers/handler3 request)
    nil))
