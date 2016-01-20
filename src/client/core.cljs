(ns client.core)

(def board (atom [0 0 0 0
                  0 0 0 0
                  0 0 0 0
                  0 0 0 0]))

;; :size 0 (small) 1 (large)
;; :color 0 (black) 1 (white)
;; :shape 0 (circle) 1 (square)
;; :hole 0 (solid) 1 (hollow)
(def pieces (atom [{:size 0 :color 0 :shape 0 :hole 0}
                   {:size 0 :color 0 :shape 0 :hole 1}
                   {:size 0 :color 0 :shape 1 :hole 1}
                   {:size 0 :color 1 :shape 0 :hole 1}
                   {:size 0 :color 1 :shape 1 :hole 1}
                   {:size 1 :color 0 :shape 0 :hole 1}
                   {:size 1 :color 1 :shape 0 :hole 1}
                   {:size 1 :color 0 :shape 1 :hole 1}
                   {:size 1 :color 1 :shape 1 :hole 1}
                   {:size 1 :color 1 :shape 1 :hole 0}
                   {:size 1 :color 1 :shape 0 :hole 0}
                   {:size 1 :color 0 :shape 1 :hole 0}
                   {:size 1 :color 1 :shape 1 :hole 0}
                   {:size 1 :color 0 :shape 0 :hole 0}
                   {:size 1 :color 1 :shape 0 :hole 0}
                   {:size 1 :color 0 :shape 0 :hole 0}]))
