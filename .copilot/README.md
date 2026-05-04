# .copilot - AI Coding Agent Instructions

This folder centralizes all AI coding assistant instructions and guidelines for this repository. Tools like GitHub Copilot, Cursor, Windsurf, and Claude automatically discover and use files in this directory.

## Files in This Directory

### `AGENTS.md`
Comprehensive guide for AI agents working on this algorithms repository. Covers:
- Project architecture and module organization
- Development workflow and build/run commands
- Coding patterns and conventions specific to this codebase
- Critical integration points between modules
- Common gotchas and project-specific patterns
- Task patterns for adding new algorithms, debugging, and navigation

## Supported File Types

This `.copilot/` folder can contain various instruction file formats:
- `AGENTS.md` - Primary agent instructions (this one)
- `.cursorrules` - Cursor IDE rules
- `.windsurfrules` - Windsurf rules
- `.clinerules` - Claude/Cline rules
- Custom markdown guides for specific tools

## Discovery Priority

Most AI tools discover instructions in this priority order:
1. `.copilot/` folder (this directory)
2. `.github/copilot-instructions.md`
3. Root-level instruction files `.cursorrules`, `.windsurfrules`, etc.
4. Project README.md

Centralizing here ensures consistent behavior across all AI agents.

## Adding New Instructions

When adding tool-specific instructions:
1. Create appropriately named file in this folder
2. Follow the tool's official instruction format
3. Reference `AGENTS.md` for project-specific context
4. Keep tool-specific files brief; leverage shared context from AGENTS.md

---

**Last organized**: May 2, 2026

