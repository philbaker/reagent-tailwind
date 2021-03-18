(ns frontend.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [frontend.views :as views]))

(defn ^:dev/after-load start
  []
  (rdom/render [views/app]
                      (.getElementById js/document "app")))

(defn ^:export main
  []
  (start))
