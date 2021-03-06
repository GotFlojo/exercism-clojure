(ns bob)

(defn yelling? [s]
    (let [letters (filter #(Character/isLetter %) s)]
      (and (seq letters)
           (every? #(Character/isUpperCase %) letters))))

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
