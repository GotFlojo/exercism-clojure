(ns bob)

(defn yelling? [s]
    (every? #(or (not (Character/isLetter %))
                 (Character/isUpperCase %))
            s))

(defn asking? [s]
  (= \? (last s)))

(defn nothing? [s]
  (clojure.string/blank? s))

(defn response-for [s] ;; <- arglist goes here
  ;; your code goes here
  (cond
    (nothing? s) "Fine. Be that way!"
    (yelling? s) "Whoa, chill out!"
    (asking? s) "Sure."
     :else "Whatever."))
