- Approaches
- 3075.This problem follows the pattern:
Pick the largest remaining value first, while accounting for a cumulative global penalty.
- 2483.This is a classic prefix–suffix.
  1. Count total 'Y' → suffixY
  2. Initialize prefixN = 0
  3. For j = 0..n:
     penalty = prefixN + suffixY
     Track minimum penalty and earliest j
     Update counts for next step
