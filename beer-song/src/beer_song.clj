(ns beer-song)

(defn bottles [num]
  (cond
    (> num 1) (str num " bottles")
    (= num 1) (str num " bottle")
    :else (str "no more bottles")))

(defn verse [num]
  (cond
      (> num 1) (str num " bottles of beer on the wall, " num " bottles of beer.\n"
                     "Take one down and pass it around, " (bottles (dec num)) " of beer on the wall.\n")
      (= num 1) (str num " bottle of beer on the wall, " num " bottle of beer.\n"
                     "Take it down and pass it around, no more bottles of beer on the wall.\n")
      :else (str "No more bottles of beer on the wall, no more bottles of beer.\n"
                 "Go to the store and buy some more, 99 bottles of beer on the wall.\n")))

(defn sing
  ([n] (sing n 0))
  ([n m]
   (clojure.string/join "\n" (map verse (range n (dec m) -1)))))
