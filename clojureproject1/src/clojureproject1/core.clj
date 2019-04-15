(ns clojureproject1.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn example-handler [request]
  {:body "Hello Clojure!"})

(defn on-init []
  (println "Initialization sample wepapp!"))

(defn on-destroy []
  (println "Destroying sample webapp!"))
