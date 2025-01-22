(ns strings.palindrome
  (:require [clojure.string :as str]))

(defn is-palindrome? [s]
  (let [sl (.toLowerCase s)]
    (= sl (apply str (reverse sl)))))

(defn find-palindrome-words [s]
  (filter is-palindrome? (str/split s #" ")))

;; check out for sentence palindrome
;; https://www.geeksforgeeks.org/sentence-palindrome-palindrome-removing-spaces-dots-etc/