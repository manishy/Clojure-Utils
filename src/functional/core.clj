(ns functional.core)

; factorial -----------------------
(defn factorial [x]
  (if (> 1 x) 1
      (* x (factorial (dec x)))))

; my-drop -------------------------
(defn my-drop [till coll]
  (loop [count till c coll]
    (if (or (empty? c) (= count 0))
      c
      (recur (- count 1) (rest c)))))

; my-map  -------------------------
(defn my-map [f coll]
  (loop [c coll final []]
    (if (empty? c) final
        (recur (rest c) (conj final (f (first c))))
        )
    ))


; my-filter ------------------------

(defn my-filter [f coll]
  (loop [c coll final []]
    (if (empty? c) final
        (if (f (first c))
          (recur (rest c) (conj final (first c)))
          (recur (rest c) final)))))

