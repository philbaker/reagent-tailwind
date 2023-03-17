(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [app.views :as views]))

(defn ^:dev/after-load start
  []
  (rdom/render [views/app]
               (.getElementById js/document "app")))

(defn ^:export main
  []
  (start))
