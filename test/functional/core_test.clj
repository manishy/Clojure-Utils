(ns functional.core-test
  (:require [clojure.test :refer :all]
            [functional.core :refer :all]))

(deftest Factorial-Test
  (testing "Factorial"
    (is (= (factorial 1) 1))
    (is (= (factorial -1) 1))
    (is (= (factorial 2) 2))
    (is (= (factorial 0) 1))
    ))

(deftest My-Drop-Test
  ( testing "My-Drop"
    (is (= (my-drop 2 [1 2 3 4 5]) [3 4 5]))
    (is (= (my-drop 1 [1 2 3 4 5]) [2 3 4 5])) 
    (is (= (my-drop 2 []) []))
    (is(= (my-drop 0 [2 3]) [2 3]))
    ))



(deftest My-Map-Test
  (testing "My-Map"
    (is(= (my-map even? [1 2 3]) [false true false]))
    (is(= (my-map inc [1 2 3 4 5]) [2 3 4 5 6]))
    (is(= (my-map dec [1 2]) [0 1]))
    ))