(ns numbers.core
  (:require [numbers.prime :as prime]
            [numbers.perfect-numbers :as perfect])
  (:gen-class))

(defn -main []
  (println "All prime numbers between 1 and 100")
  (time (doall
         (let [numbers (prime/prime-seq 1 100)]
           (println numbers))))

  (println "\nGet the first 4 perfect numbers")
  (time (doall 
         (let [numbers (take 4 perfect/perfect-numbers)]
                (println numbers))))
  
  ; the fifth perfect number is 33550336 and will take a really long time to compute
  )
