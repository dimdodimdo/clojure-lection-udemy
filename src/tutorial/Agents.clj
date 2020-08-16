(ns tutorial.Agents)

(defn Agents
  []
  (def amount (agent 100))
  (println @amount)
  (send amount inc)
  (println @amount)
  (println "some time must pass")
  (println @amount)

  (send amount inc)
  (await-for 1 amount)
  (println @amount)

  (println (agent-error amount))
  )

(Agents)
