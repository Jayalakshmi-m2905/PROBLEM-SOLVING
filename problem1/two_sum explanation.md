# Two Sum Problem – Code Explanation

## 📌 Description
The program solves the **Two Sum** problem:  
Given an array of integers `nums` and an integer `target`, it finds two numbers in the array whose sum equals the target and returns their indices.  

It uses two nested loops to check all possible pairs of numbers. As soon as it finds a pair that adds up to the target, it immediately returns their indices. If no such pair exists, it returns an empty array.  

---

## ⚡ Approach – Brute Force
- The algorithm uses a **double loop**:
  - The **outer loop** picks the first number (`nums[i]`).
  - The **inner loop** picks the second number (`nums[j]`) for every index after `i`.
  - It checks if `nums[i] + nums[j] == target`.  
- If true, it returns `{i, j}`.  
- This way, it examines **all possible pairs** in the array.  

**Time Complexity:** `O(n²)`  
**Space Complexity:** `O(1)`  

---

## ✅ Pros of this Approach
1. **Simple to Understand** – Beginner-friendly logic.  
2. **Guaranteed Correctness** – Since all pairs are checked, the solution is always found if it exists.  
3. **No Extra Data Structures** – Only uses basic loops and constant space, making it memory-efficient.  
