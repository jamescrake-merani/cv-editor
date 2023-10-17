(ns cv-editor.main
  [:require [reagent.core :as r]
   [reagent.dom :as rd]])

(defn base []
  [:div
   [:p "Hello World!"]])

(defn render
  []
  (rd/render [base]
             (.getElementById js/document "root")))
