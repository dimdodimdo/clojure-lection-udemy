(ns tutorial.petstore)

(defn petToHumanAge
  ""
  [x]
  (def petStore {'dog 7, 'cat 5})
  (get petStore x)
  )

(defn age
  ""
  [petName petType petAge]
  (def ratio (petToHumanAge petType))
  (println petName "is" (* ratio petAge) "years old")
  )

(age "tobik" 'dog 5)
(age "tobik" 'dog 5)
(age "tobik" 'dog 5)