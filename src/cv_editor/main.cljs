(ns cv-editor.main
  [:require [reagent.core :as r]
   [reagent.dom :as rd]])

(def initial-cv
  {:full-name ""
   :biography ""})

(def current-cv
  (r/atom initial-cv))

(defn base []
  [:div
   [:p "Hello World!"]])

(defn render
  []
  (rd/render [base]
             (.getElementById js/document "root")))
