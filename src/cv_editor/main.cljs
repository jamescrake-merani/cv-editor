(ns cv-editor.main)

(defn base []
  [:p "Hello World!"])

(defn render
  []
  (rd/render [base]
             (.getElementById js/document "root")))
