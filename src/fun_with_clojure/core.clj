(ns fun-with-clojure.core
  (:gen-class))

(def options ["fizzbuzz"])

(declare fizzbuzz)

(defn -main
  "Fun with Clojure!"
  [& args]
  (let [arg (first args)]
    (if-not arg 
      (println "You have to tell me what to do. Available options:" options)
      (if (= arg "fizzbuzz")
        (fizzbuzz)
        (println "Option unavailable:" arg)))
    )
  )

(defn fizzbuzz
  "Fizzbuzz"
  [& args]
  (dorun (map (fn [i]
                (if (= (mod i 15) 0)
                  (println "fizzbuzz")
                  (if (= (mod i 3) 0)
                    (println "fizz")
                    (if (= (mod i 5) 0)
                      (println "buzz")
                      (println i))))
                )
              (range 1 101)   
              )
         ))
