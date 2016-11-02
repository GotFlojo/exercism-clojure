(ns word-count)

(defn words [s]
  (clojure.string/split
    (clojure.string/lower-case s) #"[^\w]+"))

(defn word-count [s]
  (into {} (frequencies (words s)))) ;; <- arglist goes here(clojure.string/split s)
