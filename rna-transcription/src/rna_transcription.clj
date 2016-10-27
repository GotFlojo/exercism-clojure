(ns rna-transcription)

(defn to-rna [s] ;; <- arglist goes here
  ;; your code goes here
  (apply str (map #(if-let [rna ({\G \C, \C \G, \T \A, \A \U} %)]
                     rna
                     (throw  (AssertionError. (str "No valid DNA base: " %))))
                  s)))
