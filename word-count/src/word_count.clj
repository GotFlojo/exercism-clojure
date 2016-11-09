(ns word-count)

(defn words [s]
  (clojure.string/split
    (clojure.string/lower-case s) #"[\W]+"))

(defn filter-same [coll item]
  (filter #(= item %) coll))

;; reduce collection to map
;; start with empty map
;; take elemnt
;; see if key with elementname exists
;; if yes get value and increment it
;; if no add key with value 1
(defn frequency [c]
  (reduce (fn [dict elem]
              (assoc dict elem (inc (dict elem 0)))) {} c))

(defn word-count [s]
  ;;(into {} (frequencies (words s))))
  (frequency (words s)))
