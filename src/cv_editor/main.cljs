(ns cv-editor.main
  [:require [reagent.core :as r]
   [reagent.dom :as rd]
   [cv-editor.fields :as fields]])

(def initial-cv
  {:full-name ""
   :biography ""})

(def current-cv
  (r/atom initial-cv))

(defn field-editor
  [field]
  (let [editing? (r/atom false)
        save-callback
        (fn [new-value]
          (swap! current-cv #(assoc current-cv field new-value)))
        edit-toggle-callback (fn [] (swap! editing? #(not %)))
        components (get fields/field-component-map field)
        value (get @current-cv field)]
    (if editing?
      ((second components) value save-callback)
      ((first components) value edit-toggle-callback))))

(defn base []
  [:div
   [:p "Hello World!"]])

(defn render
  []
  (rd/render [base]
             (.getElementById js/document "root")))
