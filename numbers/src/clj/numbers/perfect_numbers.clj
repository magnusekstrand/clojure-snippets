(ns numbers.perfect-numbers)

(defn- is-factor? [divident divisor]
  (zero? (mod divident divisor)))

(defn- factors [number]
  (distinct                                            ; no dups for perfect squares (e.g. 16, 64, 49)
   (mapcat #(when (is-factor? number %)                ; when a factor is found
              [(/ number %) %])                        ; return a pair of [number/factor, factor]
           (range 1 (inc (Math/sqrt number)) 1))))     ; go upto a (sqrt number) inclusively

;;         (range 1 (max 2 (inc (quot num 2))))        ; alternatively reduce the range by a half,
                                                       ; as you won't ever have factors that are greater
                                                       ; than the number you're testing divided by 2
                                                       ; however, not as efficient as using square root

(defn- is-perfect? [number]
  (= (reduce + (factors number)) (* 2 number)))        ; check if sum of factors = 2*N

(def perfect-numbers
  (filter is-perfect? (nnext (range))))