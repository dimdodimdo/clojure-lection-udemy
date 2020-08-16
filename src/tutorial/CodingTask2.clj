(ns tutorial.CodingTask2)
(def discount 0.8)
(defn getAllCars
  []
  (defstruct carsMapPattern :carManufacturer :price)
  (def bmw (struct carsMapPattern "bmw" 60000))
  (def ferrari (struct carsMapPattern "ferrari" 100000))
  (def fiat (struct carsMapPattern "fiat11" 20000))
  (def bu (vector bmw ferrari fiat)
    )
  (vector bmw ferrari fiat)
  )




 (defn getCarAvailable
   [budget]
   (def maxPriceAccepted (* budget discount))
   (def validCars (atom nil))
   (println "\nMax Price Accepted: " maxPriceAccepted)
   (def allCars (getAllCars))
   (def passedCars (atom nil))
   (doseq [i allCars]
     (def discountPrice (* (i :price) discount))
     (if (> budget discountPrice)
       (println i)
       )

     )



   )

(defn printCarByPriceAvailability
  [budget]
  (println "try coding")
  (getCarAvailable budget)
  )
(printCarByPriceAvailability 50000)

