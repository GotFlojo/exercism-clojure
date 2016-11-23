(ns anagram)

(defn char-frequencies [string]
  (frequencies (seq string)))

(defn is-anagram? [word candidate]
  (let [w (clojure.string/lower-case word)
        c (clojure.string/lower-case candidate)]
    (if (= c w)
      false
      (= (char-frequencies w) (char-frequencies c)))))

(defn anagrams-for [word candidates]
  (filter (partial is-anagram? word) candidates))
