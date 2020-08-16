(ns tutorial.Loops)
(defn Loop
  []
  (println "\nloop:")
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x))
      )
    )
  )
(Loop)

(defn DoTimes
  []
  (println "nDoTimes:")
  (dotimes [x 10]
    (println x)
    )
  )
(DoTimes)

(defn WhileDo
  [count]
  (println "\nWhileDo:")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x inc)
      )
    )
  )
(WhileDo 10)

(defn DoSeq
  [seq]
  (println "\nDoSeq:")
  (doseq [x seq]
    (println (inc x))
    )
  )
(DoSeq [7 4 3 5])
