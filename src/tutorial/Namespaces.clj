(ns tutorial.Namespaces
  (:require [clojure.string :refer :all])
  )
(defn -main
  []
  (println (capitalize (reverse "hello")))
  )
(-main)