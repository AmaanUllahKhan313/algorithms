# AGENTS.md - Algorithms Repository Developer Guide

## Project Overview
This is a comprehensive **algorithms and data structures practice repository** built with Gradle (Java 11). It contains 18+ categorized modules containing 100+ algorithm solutions designed for learning and interview preparation. The codebase emphasizes executable implementations with embedded test cases rather than formal test suites.

**Key Stack**: Java 11+ | Gradle | No external testing framework

---

## Module Architecture

### Organization Scheme
Modules follow a **numerical category system** under `src/main/java/com/`:
- `algos01_arrays/` → Array problems
- `algos02_linkedlist/` → Linked list operations
- `algos03_stack/` → Stack-based algorithms
- `algos04_slidingwindow/` through `algos09_recursion/` → Different DSA concepts
- `algos10_tree/` → Binary trees, BST, tree traversals
- `algos11_searching/` through `algos17_trie/` → Search algorithms, heaps, graphs, tries
- `algos18_companies/` → Company-specific interview questions

### File Naming Conventions
- **Numeric prefixes for ordering**: `_01DFS.java`, `_11ClimbingStaircase.java`, `Foundation_Program_1_NGEToRight.java`
- **Descriptive names without prefix**: `MajorityElement.java`, `ValidParenthesis.java` (when file order doesn't matter)
- **Pattern**: Prefer `_NN<DescriptiveName>.java` to establish reading order for foundational concepts

### Data Structure Foundations
Each module with shared structures contains a core file:
- `algos10_tree/_1BTree.java` - Base binary tree node definition with multiple test tree builders (`initializeTree()`, `initializeTree2()`, `createMirrorTrees()`)
- `algos16_graphs/_0Graph.java` - Graph representation with adjacency list
- `algos03_stack/ImplementStackUsingArray.java` - Custom stack implementation used across stack problems

**Pattern**: Referenced by multiple algorithm files; treat as foundational contracts.

---

## Development Workflow & Execution

### Build & Run
```bash
# Build project
./gradlew build

# Run specific algorithm file (main class)
./gradlew run -DmainClass=com.algos01_arrays.MajorityElement --quiet

# Compile only
./gradlew compileJava
```

### Test Case Structure
**No JUnit or external test framework used**. Instead, all testing is **embedded in `main()` methods**:

```java
// Pattern: Hardcoded test data in main()
public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {1,3,3,4,3,8,3,3,8,3};
        System.out.println(getMajorityElement(a));  // Direct console output
    }
    
    private static int getMajorityElement(int[] a) { /* logic */ }
}
```

**When modifying algorithms**: Keep test data in main(); add multiple test cases separated by manual output. Run via `./gradlew run` or IDE main() execution.

### Entry Point: Interactive Study Helper
**`src/main/java/com/algos/ClickMeAndRunToStudyNewProblems.java`**

This is a unique study workflow tool that:
1. Fetches random LeetCode problems from GitHub
2. Opens them in the default browser
3. Tracks already-studied problems in `alreadySolvedProblems.txt`

**Note**: Uses Java 11 HttpClient; requires internet access. Useful for random practice but not essential for algorithm execution.

---

## Coding Patterns & Conventions

### Algorithm Implementation Pattern
1. **Minimal class declaration** - Often just algorithm logic in static methods
2. **Static methods preferred** - No instance state; focus on pure computation
3. **Direct Java Collections usage** - HashMap, ArrayList, Stack, Queue from `java.util`
4. **No object-oriented design** - These are procedural, focused solutions
5. **Variable naming**: Concise local vars (`a[]`, `i`, `j`, `m`, `n`) typical of DSA contexts

```java
// Typical pattern from MajorityElement.java
public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {1,3,3,4,3,8};
        System.out.println(getMajorityElement(a));
    }
    
    private static int getMajorityElement(int[] a) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++) {
            if(!map.containsKey(a[i])) map.put(a[i], 1);
            else if(map.get(a[i])+1 > Math.floor(a.length/2)) return a[i];
            else map.put(a[i], map.get(a[i])+1);
        }
        return -1;
    }
}
```

### Tree Problem Pattern
Tree algorithms reference shared `_1BTree` class:
- **Node Definition**: `_1BTree.left`, `.right`, `.data` (public fields)
- **Tree Construction**: Use static builders like `_1BTree.initializeTree()` for test data
- **Traversal Pattern**: DFS/BFS recursion or iterative stack-based approach

```java
// From tree algorithms
_1BTree root = _1BTree.initializeTree();  // Create test tree
// ... traversal logic
```

### Graph Problem Pattern
Graph algorithms use `_0Graph` class with:
- `_0Graph.V` - vertex count
- `_0Graph.adj[]` - adjacency list (ArrayList per vertex)
- `_0Graph.getGraph()` - static factory method for test graphs

---

## Key Integration Points

### Cross-Module References
- **Tree algorithms** → depend on `_1BTree` node class
- **Graph algorithms** → depend on `_0Graph` adjacency structure
- **Stack problems** (NGE, Histogram) → depend on custom `ImplementStackUsingArray`
- **String/Substring problems** → use HashMap for character frequency

### Common External Dependencies
None in gradle.gradle except `mavenCentral()` repository. Pure Java 11 stdlib only.

### Import Patterns to Know
```java
import java.util.*;              // Collections framework
import java.util.stream.*;       // Stream API (occasionally)
import java.util.Iterator;       // For graph traversal
import java.io.*;                // File operations (rare)
import java.net.http.*;          // HttpClient (only study helper)
```

---

## Project-Specific Gotchas

### Naming Inconsistencies
- `algos02_linkedlist/` but algorithms reference no `_0LinkedList` base class
- Some algorithms use ArrayList instead of custom linked list implementation
- Package names use abbreviated numbers (`algos01_arrays`) but problem files often don't

### No Formal Testing Framework
- Cannot use standard IDE test runners (JUnit, TestNG)
- Run algorithms via main() method execution only
- For verification, add multiple `println()` statements and visually inspect output
- Consider the repository a **learning tool** rather than production-ready code

### Gradle Entry Points
- `./gradlew build` compiles but doesn't auto-execute tests
- Run individual algorithms via IDE "Run" feature on main() method
- No test task configured; all manual verification

### Study Tool Note
The `ClickMeAndRunToStudyNewProblems.java` requires:
- Internet connectivity for GitHub/LeetCode API calls
- File system write access for tracking progress
- Windows-specific browser launch (uses `rundll32 url.dll`)
- Not essential for algorithm practice, mainly a convenience utility

---

## For AI Agents: Key Task Patterns

### Adding a New Algorithm
1. Create file in appropriate category folder (e.g., `algos13_heap/TopKElements.java`)
2. Use numeric prefix if establishing ordering: `_NNAlgorithmName.java`
3. Include package declaration matching directory structure
4. Add main() method with hardcoded test cases
5. Implement static methods with algorithm logic
6. If using tree/graph problems, reference `_1BTree` or `_0Graph` initialization methods

### Debugging Algorithms
- Direct console output via `System.out.println()` is standard
- Modify test data in main() and re-run
- Check imports: should mostly be `java.util.*`
- If tree traversal fails, verify `_1BTree` node can be instantiated

### Module Dependency Navigation
- Look up algorithms in the README.md for quick links
- Numeric prefixes indicate learning progression within a module
- "Foundation_Program_" prefix indicates core techniques used by multiple algorithms

---

## Quick Reference: Module Entry Points

| Module | Purpose | Key Files |
|--------|---------|-----------|
| `algos01_arrays` | Array manipulation, searching | MajorityElement.java, MergeSortedArrays.java |
| `algos03_stack` | Stack operations | Foundation_Program_*_NGE*.java (Next Greater Element patterns) |
| `algos10_tree` | Tree algorithms | _1BTree.java (base), _01DFS.java, _05LevelOrder.java |
| `algos15_dynamicprogramming` | DP solutions | _01LongestCommonSubsequence.java, _11ClimbingStaircase.java |
| `algos16_graphs` | Graph algorithms | _0Graph.java (base), _01DFS.java, _07BFS.java |

---

**Last Updated**: May 2026  
**Build Tool**: Gradle | **Languages**: Java 11 | **Test Framework**: None (embedded main() tests)

