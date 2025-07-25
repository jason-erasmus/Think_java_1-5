#!/bin/bash
echo "Running all chapters..."

for chapter in Chapter_*; do
  echo "Checking $chapter"
  
  for class_file in $(find "$chapter" -name "*.class"); do
    class_name=$(echo "$class_file" | sed 's/\.class$//' | tr '/' '.')
    
    echo "Running $class_name"
    java "$class_name" || echo "Failed to run $class_name"
    echo "---"
  done

done
