(ns tutorial.StrctMaps
  (:import (clojure.lang APersistentSet)))

(defn Pets
  []
  (defstruct pet :PetType :PetName)
  (def myPet (struct pet "dog" "Fido"))
  (println myPet)

  (def myOtherPet (struct-map pet :PetName "Fiti" :PetType "cat"))
  (println myOtherPet)
  (println (:PetName myOtherPet) )

  (def myNewPet (assoc myPet :PetName "Max"))
  (println myNewPet)


  (def myNewOtherPet (assoc myOtherPet :PetAge 10))
  (println myNewOtherPet)
  )
(Pets)
