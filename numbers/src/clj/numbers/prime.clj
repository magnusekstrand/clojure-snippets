(ns numbers.prime)

(defn is-prime? [n]
  (empty? (filter #(= 0 (mod n %)) (range 2 n))))  ; 1 is not a prime number => range starts at 2

(defn prime-seq [from to]
  (filter is-prime? (range from (inc to))))

(defn next-prime-from [n]
  (loop [candidate (inc n)]
    (if (is-prime? candidate)
      candidate
      (recur (inc candidate)))))
