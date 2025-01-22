(ns strings.core 
  (:require
   [strings.palindrome])
   (:gen-class) 
)

(defn -main []
  (println "Find the palindrome words in sentence 'Madam Arora teaches malayalam'")
  (println (strings.palindrome/find-palindrome-words "Madam Arora teaches malayalam")))
  
