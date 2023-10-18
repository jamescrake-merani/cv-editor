(ns cv-editor.fields
  [:require [reagent.core :as r]])

(def field-component-map
  {:full-name [full-name-view full-name-editor]})

(defn full-name-view
  [value callback]
  [:div
   [:h1.text-center value]
   [:button {:on-click callback} "Change"]])

(defn full-name-editor
  [value callback]
  (let [current-value (r/atom value)]
    (fn []
      [:div
       [:p "Full Name"]
       [:input {:type "text"}]
       [:button {:on-click callback} "Save"]])))
