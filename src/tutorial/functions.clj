(ns tutorial.functions
  (:gen-class))

(def petCoefficient
  "this coefficient represents pet to human age"
  {'DOG 7, 'CAT 5, 'FISH 10})


(defn getPetCoefficient
  "we get coefficient for aaa particular pet"
  [petType]
  (get petCoefficient petType)
  )


(defn getAge
  [petName, petType, age]
  (def newAge (* age (getPetCoefficient petType)))
  (println petName age " years old has an age equal of human "
           newAge )
  )

(getAge "me" 'CAT 4)