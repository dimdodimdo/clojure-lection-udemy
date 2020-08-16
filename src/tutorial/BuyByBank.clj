(ns tutorial.BuyByBank)
(defn Init
  []
  (def prices {"book" 10, "notebook" 5, "backpack" 10})
  (def user (ref {"money" 100, "book" 0, "notebook" 0, "backpack" 0}))
  (def bank (ref {"money" 0, "book" 100, "notebook" 20, "backpack" 10}))

  )

(defn Buy
  [item]
  (dosync
    (if (contains? prices item)

      (do
        (def price (get prices item))
        (println "\nItem" item "exists. Price is:" (prices item))
        (if(> (user "money") price)
          (do

             )
          (do (println "\n Not enough money to buy" item)))
        )
      (do (println "\nItem does not exist"))
      )

    )


  )
(Init)
(Buy "book")

;(defn Init
;  []
;  (defstruct account :name :case :items)
;  (defstruct items :item :amount)
;  (defstruct item :name :price)
;
;  (def pen (struct item "pen" 5))
;  (def book (struct item "book" 5))
;  (def backpack (struct item "backpack" 10))
;  (def items (vector pen book backpack))
;  (def bankStorage)
;  (def userAccount (ref (struct account "user", 100, nil)))
;  (def bankAccount (ref (struct account "bank", 0, [])))
;  )




;(def userAccount (ref (struct account "user", 100, nil)))
;(def bankAccount (ref (struct account "bank", 0, [])))
