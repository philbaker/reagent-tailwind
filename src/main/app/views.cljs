(ns app.views
  (:require [app.state :refer [app-state]]
            [app.events :refer [increment decrement]]))

(defn header
  []
  [:div.px-6
   [:h1.text-2xl.mt-6 "Reagent + Tailwind starter"]])

(defn counter
  []
  [:div.mt-6.px-6
   [:button.p-2.bg-blue-200 
    {:on-click #(decrement %)} "-"]
   [:button.p-2.bg-blue-100 
    {:disabled true} (get @app-state :count)]
   [:button.p-2.bg-blue-200 
    {:on-click #(increment %)} "+"]])

(defn app []
  [:div
   [header]
   [counter]])
