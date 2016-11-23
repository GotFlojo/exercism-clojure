(ns anagram)

(defn is-anagram? [word candidate]
  (let [w (clojure.string/lower-case word)
        c (clojure.string/lower-case candidate)]
    (if (= c w)
      false
      (= (sort (seq w)) (sort (seq c))))))

(defn anagrams-for [word candidates]
  (filter (partial is-anagram? word) candidates))
