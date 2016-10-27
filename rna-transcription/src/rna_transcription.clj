(ns rna-transcription)

(defn to-rna [s] ;; <- arglist goes here
  ;; your code goes here
  (apply str (map #({\G \C, \C \G, \T \A, \A \U} %) s)))
